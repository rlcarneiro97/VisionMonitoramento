/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Visita;

/**
 *
 * @author Rafael
 */
public class VisitaDao {

    public int gravarDados(Visita visita) {

        int validacao = 1;

        EntityManagerFactory prefab = Persistence.createEntityManagerFactory("visionmonitoramento");
        EntityManager entidade = prefab.createEntityManager();
        EntityTransaction transacao = entidade.getTransaction();

        try {
            transacao.begin();
            entidade.persist(visita);
            transacao.commit();
        } catch (Exception e) {
            validacao = 0;
        }

        return validacao;

    }//fim metodo

}
