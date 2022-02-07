package Examen_tercertrimestre_RuizFernanderBenjamin;

import java.util.Comparator;
import java.util.Map;

class ValueComparator implements Comparator<Integer>{
	Map<Integer, Vendedor> base;
	public ValueComparator(Map<Integer, Vendedor> base) {
        this.base= base;
    }


    public int compare(Integer a, Integer b) {
        
		if (base.get(a).getComision() >= base.get(b).getComision()) {
            return -1;
        } else {
            return 1;
        } 
    }







}


