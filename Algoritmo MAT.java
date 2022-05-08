package javaapplication7;
import javax.swing.JOptionPane;


public class JavaApplication7 {

// Autores: Emanuel Ferreira, Islan Santos, Jean Ferreira e Jorge Otavio em 06/08/2021

        public static void main(String[] args) {
                
        /*
        Questao:
        
        As equacoes gerais das duas retas r e s sao respectivamente:
        Reta R: x + 4y - 7 = 0
        Reta S: 3x + y + l = 0
        Crie uma aplicacao que verifique se as retas sao concorrentes,
        e se forem concorrentes determine o ponto comum as retas.
        */
        
        //Dados da Reta R: a = 1; b = 4; c = -7.
        //Dados da Reta S: a = 3; b = 1; c = 1.
        
        int x, y, somax, somac;
      
        ///Solicitando os dados da Reta R:
        int aR = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o valor de A da reta R: (Ax + by + c)"));
        //aR = 1;
        
        int bR = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o valor de B da reta R: (ax + By + c)"));
        //bR = 4;
        
        int cR = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o valor de C da reta R: (ax + by + C)"));
        //cR = -7;
        
        
        //Solicitando os dados da Reta S:
        int aS = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o valor de A da reta S: (Ax + by + c)"));
        //aS = 3;
        
        int bS = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o valor de B da reta S: (ax + By + c)"));
        //bS = 1;
        
        int cS = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o valor de C da reta S: (ax + by + C)"));
        //cS = 1;

        
        // Calculando a determinante para descobrir se as retas sao concorrentes:
        
        int calcDet = (aR * bS) - (aS * bR);
        System.out.println("Determinante = " + calcDet);

        switch (calcDet) {
            
            case 0: 
                 System.out.println("As retas nao sao concorrentes!");
                 break;
            
            default:              
            //Exibicao das retas
            System.out.println("r: " + aR + "x + " + bR + "y " + cR + " = 0");
            System.out.println("s: " + aS + "x + " + bS + "y +" + cS + " = 0");
            
            //Trocando o sinal do C (colocando do outro lado da igualdade)
            cR = (cR * (-1));
            cS = (cS * (-1));
            
            //Exibindo o sistema:
            System.out.println("Eq 1: " + aR + "x + " + bR + "y = " + (cR));
            System.out.println("Eq 2: " + aS + "x + " + bS + "y = " + (cS));

            //Se nÃ£o der para eliminar o Y:
            if (bS + bR != 0) {
                aS = (aS * (-bR));
                bS = (bS * (-bR));
                cS = (cS * (-bR));
            }
                     
            somax = aR + aS;
            somac = cR + cS;
            
            //X e Y:
            x = somax / somac;
            y = (cR + (aR * (-1)) * x) / bR;
            System.out.println("x = " + x + " | " + "y = " + y);

            JOptionPane.showMessageDialog(null, "As retas sao concorrentes. Ponto em comum: (" + x + ", " + y + ")");
            }
        }

    }

