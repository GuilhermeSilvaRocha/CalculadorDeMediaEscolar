public class CalculadoraMediaEscolar {
    public static void main(String[] args) {
        double nota1 = 3;
        double nota2 = 5;
        double media = (nota1 + nota2) / 2;
        if (media >= 7){
            System.out.println("Aluno aprovado! Média:" +media);
        } else if (media >= 5 && media <7) {
            System.out.println("Aluno em recuperação. Média:" +media);
        }else
            System.out.println("Aluno reprovado!" +media);

        String conceito;

        if (media >= 9){
            conceito = "A";
        } else if (media >=7) {
            conceito = "B";
        } else if (media >= 5) {
            conceito = "C";
        } else if (media >= 3) {
            conceito = "D";
        }else {
            conceito = "F";
        }
        switch (conceito){
            case "A":
                System.out.println("Excelente!");
                break;
            case "B":
                System.out.println("Bom!");
                break;
            case "C":
                System.out.println("Regular!");
                break;
            case "D":
                System.out.println("Ruim!");
                break;
            case "F":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Invalído!");
                break;
        }
    }
        }

