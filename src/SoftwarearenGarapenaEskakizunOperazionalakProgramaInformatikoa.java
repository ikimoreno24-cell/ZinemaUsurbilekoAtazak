import java.util.Scanner;
public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {

    //Birfaktorizazioaren azalpena: programa errazagoa eta motzagoa egiten duen metodoa da, adibidez: menuan erabiltzen da, for bat jartzen dugu guk 1 sakatzean informazio guztian jarraian atertzeko eta ez behar izateko denbora guztian terminalean botoiak sakatzen ibili behar, beraz errazagoa da eraviltzen ez dugulako run egin behar denbora guztian,
    //Debugerra erabiltzeko break pointak jarri behar dira eta run and debug atalean debug eman, gero zuj jarritako breakpointen artean step in eginda aurrera zoaz, bariablekikusten eta aukerak badaude aukeratzen joan behar zara ikusteko  bere funtzionamendua, eta atzera egiteko step out egin eta berdina. Horrela aplikazioaren atal bakoitzaren funtzionamendua egokia dela eta bariableak egoki daudela ikusi dezakezu
    public static void main(String[] args){
        //Scannerra hasieratzen
        Scanner sc = new Scanner(System.in);
        //Menu bat egingo dugu:
        System.out.println("Azalpenak ikusi nahi badituzu 1 ikutu");
        int zenb = sc.nextInt();


        if (zenb == 1){
             for (int i =0; i<4; i++){
                //1. aukera hautatzean
                if (i == 0){
                    //Eskakizun operazionalen azalpena:
                    System.out.println("1- Eskakizun operazionalak: eskakizun operazionalak programak eskatzen dituen operazioak bete ahal izateko erabiltzen diren operazioak dira.");
                }
                //2.Aukera hautatzean
                else if (i == 1) {
                    //Programa informatikoen azalpena:
                    System.out.println("2- Programa informatikoak azkenean, softwarea garatzeko erabiltzen diren programak dira, beraz bau eskakizun operazionalak sortzeko, bai softwarearen garapen egokia lortzeko programa informatikoak funtsezkoak dira.");
                }
                //3.Aukera hautatzean
                else if (i == 2){
                    //Softwarearen zikloa
                    System.out.println("3- Softwarearen 3 ziklo daude eta funtsezkoa da horiek jarraitzea softwarearen garapena bermatzeko: softwarea programa informatikoak garatzen diren espazio ez-fisikoa da, hau da; ordenagailuen programetan eta abar bilatzen dira eta akatsak daudenean inkonpatibilitate arazoak sor ditzake, baina ez da fisikoa, baizik eta birtuala.");
                }
                //4.Aukera hautatzean
                else{
                    //Softwarea zer da:
                    System.out.println("4- Softwarea sistema informatiko guztia da, ez da fisikoki existitzen baizik eta sistema informatikoen bidez bideratzen da. Ordenagailuaren softwarea sistema operatiboa da ere eta ohikoena windows da, baina beste asko daude adibidez; ubuntu, linux eta abar.");
                    System.out.println("Softwarea pribatua hala irekia izan daiteke, adibidez; windows edo IOS pribatuak dira, baina linux berriz; software librea da eta horrek esan nahi du edonork hartu dezakela sistema hori eta bere kodigoa eraldatu dezakela.");
                }
      
            }
        }
        else{
            System.out.println("ERROR");
        }
           
       
       sc.close();
    }
}
