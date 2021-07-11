package com.mercadolibre.linktracker.service;

import com.mercadolibre.linktracker.dto.request.LinkRequest;
import com.mercadolibre.linktracker.dto.response.IdLinkResponseDto;
import com.mercadolibre.linktracker.dto.response.LinkResponseDto;
import com.mercadolibre.linktracker.entity.Link;
import javassist.NotFoundException;

import java.util.List;

public interface ILinkService {
    public List<Link> listAllLink();

    public Link getLink(Long id) throws NotFoundException;

    public IdLinkResponseDto createLink(LinkRequest link);

    public String getIdLink(String id, String password);

    public Long getContLink(Long id);

    public LinkResponseDto setAccesoLink(Long id);

    public void getVisit(Long id);

}
