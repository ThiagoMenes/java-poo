package edu.thiago.pilaresPoo.Interface.equipamentos.multifuncional;

import edu.thiago.pilaresPoo.Interface.equipamentos.copiadora.Copiadora;
import edu.thiago.pilaresPoo.Interface.equipamentos.impressora.Impressora;
import edu.thiago.pilaresPoo.Interface.equipamentos.digitalizadora.Digitalizadora;

//"Herança Múltipla" -> Interface
public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora   {
    public void copiar(){
        System.out.println("Copiando via Equip. Multifuncional");
    }

    public void digitalizar(){
        System.out.println("Digitalizando via Equip. Multifuncional");
    }
    public void imprimir(){
        System.out.println("Imprimindo via Equip. Multifuncional");
    }
    
}