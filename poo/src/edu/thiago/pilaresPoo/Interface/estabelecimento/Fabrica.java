package edu.thiago.pilaresPoo.Interface.estabelecimento;

import edu.thiago.pilaresPoo.Interface.equipamentos.copiadora.Copiadora;
import edu.thiago.pilaresPoo.Interface.equipamentos.digitalizadora.Digitalizadora;
import edu.thiago.pilaresPoo.Interface.equipamentos.impressora.Impressora;
import edu.thiago.pilaresPoo.Interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        /* o equipamento multifuncional pode representar cada um dos três papeis que definimos
         * em nosso projeto
         */
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
            
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

        };






}
