package org.acme.service;

import org.acme.entity.Alticci;

public class AlticciService {

    public Alticci getAlticci(Integer position){
        return new Alticci(findAlticciValue(position), position);
    }

    public Integer findAlticciValue(Integer position){
        if(position.equals(0)){
            return 0;
        } else {
            if(position.equals(1) || position.equals(2) ){
                return 1;
            }
        }
        return findAlticciValue(position-3) + findAlticciValue(position-2);
    }

}
