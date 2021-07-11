package com.mercadolibre.linktracker.service;

import com.mercadolibre.linktracker.dto.request.LinkRequest;
import com.mercadolibre.linktracker.dto.response.IdLinkResponseDto;
import com.mercadolibre.linktracker.dto.response.LinkResponseDto;
import com.mercadolibre.linktracker.entity.Link;
import com.mercadolibre.linktracker.exception.EmptyPasswordException;
import com.mercadolibre.linktracker.exception.IdException;
import com.mercadolibre.linktracker.exception.PasswordException;
import com.mercadolibre.linktracker.exception.UrlException;
import com.mercadolibre.linktracker.logic.LinkUtils;
import com.mercadolibre.linktracker.repository.ILinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkService implements ILinkService {

    private final ILinkRepository linkRepository;

    public LinkService(ILinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Override
    public List<Link> listAllLink() {
        return linkRepository.findAll();
    }

    @Override
    public Link getLink(Long id) {
        return linkRepository.findById(id).orElseThrow(() -> new IdException());
    }

    @Override
    public String getIdLink(String id, String password) {
        Long idLong = Long.parseLong(id);
        Link link = getLink(idLong);
        if (link.getPassword().equals(password)) {
            getVisit(idLong);
            return link.getUrl();
        } else {
            throw new PasswordException();
        }
    }

    @Override
    public Long getContLink(Long id) {
        return getLink(id).getVisit();
    }

    @Override
    public LinkResponseDto setAccesoLink(Long id) {
        Link link = getLink(id);
        link.setValid(false);
        linkRepository.save(link);
        return new LinkResponseDto(getLink(id));
    }

    @Override
    public void getVisit(Long id) {
        Link link = getLink(id);
        link.setVisit(link.getVisit() + 1);
        linkRepository.save(link);
    }

    @Override
    public IdLinkResponseDto createLink(LinkRequest link) {
        LinkUtils utils = new LinkUtils();
        if (utils.urlIsValid(link.getUrl())) {
            if (utils.passwordIsValid(link.getPassword())) {
                Link linkEntity = Link.builder()
                        .valid(true)
                        .visit(1L)
                        .name(link.getName())
                        .password(link.getPassword())
                        .url(link.getUrl())
                        .build();
                linkRepository.save(linkEntity);
                return IdLinkResponseDto.builder().id(linkEntity.getId()).build();
            } else {
                throw new EmptyPasswordException();
            }
        } else {
            throw new UrlException();
        }
    }

}
