package elektronskoPoslovanje16cas;

public class ElektronskoPoslovanjeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Poslasticarnica evropa = new Poslasticarnica();
		Picerija ciao = new Picerija();
			
		evropa.postaviImeProdavnice("Evropa");
		ciao.postaviImeProdavnice("Ciao");
			
		evropa.nabaviInventar("Sladoled");
		ciao.nabaviInventar("Pica");

		}
		
	}
