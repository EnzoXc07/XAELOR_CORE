package br.com.fiap.XAELOR_CORE.Controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.web.context.annotation.ApplicationScope;

import java.sql.Connection;

@ApplicationScope
public class PerfumeController {

    @PersistenceContext
    private EntityManager em;


}
