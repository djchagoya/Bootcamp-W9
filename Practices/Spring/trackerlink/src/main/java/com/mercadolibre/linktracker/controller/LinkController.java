package com.mercadolibre.linktracker.controller;

import com.mercadolibre.linktracker.dto.request.LinkRequest;
import com.mercadolibre.linktracker.dto.response.IdLinkResponseDto;
import com.mercadolibre.linktracker.dto.response.LinkResponseDto;
import com.mercadolibre.linktracker.entity.Link;
import com.mercadolibre.linktracker.service.LinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;

@RestController
@RequestMapping(value = "/link")
public class LinkController {

    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Link>> listLink() {
        return ResponseEntity.ok(linkService.listAllLink());
    }

    //1
    @PostMapping(value = "/create")
    public ResponseEntity<IdLinkResponseDto> createLink(@RequestBody LinkRequest link) {
        return ResponseEntity.ok(linkService.createLink(link));
    }

    //2
    @GetMapping(value = "/{idLink}")
    RedirectView redirect(@PathVariable String idLink, @RequestParam(name = "password") String password) {
        return new RedirectView(linkService.getIdLink(idLink, password));
    }

    //3
    @GetMapping(value = "/metrics/{idLink}")
    ResponseEntity<Long> contLink(@PathVariable Long idLink) {
        return ResponseEntity.ok(linkService.getContLink(idLink));
    }

    //4
    @PostMapping(value = "/invalidate/{idLink}")
    public ResponseEntity<LinkResponseDto> invalidateLink(@PathVariable Long idLink) {
        return ResponseEntity.ok(linkService.setAccesoLink(idLink));
    }
}
