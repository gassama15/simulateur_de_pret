package metier;
import domaine.*;

public class Traite {

	public Pret calcule(Pret pret)
	{
		int mpret = pret.getMpret();
		double tia = pret.getTia();
		int na = pret.getNa();
		
		double tim = tia/1200;
		double res1 = (mpret * tim)/(1 - (1/(Math.pow(1+tim, 12*na))));
		double res2 = 12*na*res1;
		pret.setMmens(res1);
		pret.setMglobal(res2);
		return pret;
	}
}
