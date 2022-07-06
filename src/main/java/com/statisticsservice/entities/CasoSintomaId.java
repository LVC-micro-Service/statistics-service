package com.statisticsservice.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CasoSintomaId implements Serializable{

    @Column(name="caso_id")
    private Long casoId;

    @Column(name="sintoma_id")
    private Long sintomaId;
  
    public CasoSintomaId(Long casoId, Long sintomaId){
        this.casoId = casoId;
        this.sintomaId = sintomaId;
    }
    public CasoSintomaId(){
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((casoId == null) ? 0 : casoId.hashCode());
        result = prime * result + ((sintomaId == null) ? 0 : sintomaId.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CasoSintomaId other = (CasoSintomaId) obj;
        if (casoId == null) {
            if (other.casoId != null)
                return false;
        } else if (!casoId.equals(other.casoId))
            return false;
        if (sintomaId == null) {
            if (other.sintomaId != null)
                return false;
        } else if (!sintomaId.equals(other.sintomaId))
            return false;
        return true;
    }

    
    
}
