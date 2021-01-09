package classes_e_metodos;

public class Data {
    String dia;
    String mes;
    String ano;

    String obterMes(String mes) {
        if(mes.equalsIgnoreCase("janeiro")) {
            return "01";
        }
        else if(mes.equalsIgnoreCase("fevereiro")) {
            return "02";
        }
        else if(mes.equalsIgnoreCase("março")) {
            return "03";
        }
        else if(mes.equalsIgnoreCase("abril")) {
            return "04";
        }
        else if(mes.equalsIgnoreCase("maio")) {
            return "05";
        }
        else if(mes.equalsIgnoreCase("junho")) {
            return "06";
        }
        else if(mes.equalsIgnoreCase("julho")) {
            return "07";
        }
        else if(mes.equalsIgnoreCase("agosto")) {
            return "08";
        }
        else if(mes.equalsIgnoreCase("setembro")) {
            return "09";
        }
        else if(mes.equalsIgnoreCase("outubro")) {
            return "10";
        }
        else if(mes.equalsIgnoreCase("novembro")) {
            return "11";
        }
        else if(mes.equalsIgnoreCase("dezembro")) {
            return "12";
        }
        return "00";
    }

    String obterDataFormatada() {
        return (dia + "/" + obterMes(mes) + "/" + ano);
    }
}
