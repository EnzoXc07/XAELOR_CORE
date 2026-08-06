package br.com.fiap.XAELOR_CORE.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceUnit;
import org.hibernate.service.spi.*;
import org.springframework.web.context.annotation.ApplicationScope;

import java.sql.Connection;

@ApplicationScope
public class PerfumeDAO {

    @PersistenceContext
    private EntityManager em;

    Connection conn =

}
