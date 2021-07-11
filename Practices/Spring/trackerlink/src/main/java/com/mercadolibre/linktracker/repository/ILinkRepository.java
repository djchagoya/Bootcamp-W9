package com.mercadolibre.linktracker.repository;

import com.mercadolibre.linktracker.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILinkRepository extends JpaRepository<Link,Long> { public Link findByName(String name);
}
