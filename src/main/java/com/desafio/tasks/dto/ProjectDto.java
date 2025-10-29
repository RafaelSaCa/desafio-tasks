package com.desafio.tasks.dto;

import java.util.Date;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProjectDto {

    @NotNull(message = "Nome do projeto é obrigatório.")
    @Size (min = 3, max= 100, message ="O nome deve ter entre 3 e 100 caracteres" )
    private String name;

    private String description;

    @NotNull(message = "Data inicial é obrigatória.")
    private Date start_date;

    private Date end_date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }


    
}
