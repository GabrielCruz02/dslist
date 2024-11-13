package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;
@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPk id = new BelongingPk();
    private Integer position;

    public Belonging() {
    }

    public Belonging(Games game, GameList list, Integer position) {
        id.setGames(game);
        id.setList(list);
        this.position = position;
    }



    public BelongingPk getBelongingPk() {
        return id;
    }

    public void setBelongingPk(BelongingPk belongingPk) {
        this.id = belongingPk;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
