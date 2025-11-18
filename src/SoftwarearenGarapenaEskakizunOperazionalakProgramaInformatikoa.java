import java.util.Scanner;
public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {

    //Birfaktorizazioaren azalpena: programa errazagoa eta motzagoa egiten duen metodoa da, adibidez: menuan erabiltzen da, for bat jartzen dugu guk menutik atera nahi dugun arte 0 sakatuta, beraz errazagoa da eraviltzen ez dugulako run egin behar denbora guztian,
    //Debugerra erabiltzeko break pointak jarri behar dira eta run and debug atalean debug eman, gero zuj jarritako breakpointen artean step in eginda aurrera zoaz, bariablekikusten eta aukerak badaude aukeratzen joan behar zara ikusteko  bere funtzionamendua, eta atzera egiteko step out egin eta berdina. Horrela aplikazioaren atal bakoitzaren funtzionamendua egokia dela eta bariableak egoki daudela ikusi dezakezu
    public static void main(String[] args){
        //Scannerra hasieratzen
        Scanner sc = new Scanner(System.in);
        //Menu bat egingo dugu:
        System.out.println("1.Eskakizun operazionalak 2.Programa informatikoak 3.Softwarearen zikloa 4.Softwarea zer da eta beste software batzuk");
        int zenb = sc.nextInt();

        
        //1. aukera hautatzean
        if (zenb == 1){
            //Eskakizun operazionalen azalpena:
            System.out.println("Eskakizun operazionalak: eskakizun operazionalak programak eskatzen dituen operazioak bete ahal izateko erabiltzen diren operazioak dira.");
        }
        //2.Aukera hautatzean
        else if (zenb == 2) {
            //Programa informatikoen azalpena:
            System.out.println("Programa informatikoak azkenean, softwarea garatzeko erabiltzen diren programak dira, beraz bau eskakizun operazionalak sortzeko, bai softwarearen garapen egokia lortzeko programa informatikoak funtsezkoak dira.");
        }
        //3.Aukera hautatzean
        else if (zenb == 3){
            //Softwarearen zikloa
            System.out.println("Softwarearen 3 ziklo daude eta funtsezkoa da horiek jarraitzea softwarearen garapena bermatzeko: softwarea programa informatikoak garatzen diren espazio ez-fisikoa da, hau da; ordenagailuen programetan eta abar bilatzen dira eta akatsak daudenean inkonpatibilitate arazoak sor ditzake, baina ez da fisikoa, baizik eta birtuala.");
        }
        //4.Aukera hautatzean
        else if(zenb == 4){
            //Softwarea zer da:
            System.out.println("Softwarea sistema informatiko guztia da, ez da fisikoki existitzen baizik eta sistema informatikoen bidez bideratzen da. Ordenagailuaren softwarea sistema operatiboa da ere eta ohikoena windows da, baina beste asko daude adibidez; ubuntu, linux eta abar.");
            System.out.println("Softwarea pribatua hala irekia izan daiteke, adibidez; windows edo IOS pribatuak dira, baina linux berriz; software librea da eta horrek esan nahi du edonork hartu dezakela sistema hori eta bere kodigoa eraldatu dezakela.");
        }
        //Gaizki hautatzen bada
        else{
            System.out.println("Zenbakia ez da zuzena, mesedez jarri ezazu zenbaki egokia");
        }
      
       sc.close();
    }
}
