package mercedes.amg;

public class SEDAN_CLASS extends AUTO{

    String Inte, told, Ilum;
    double pre;

    SEDAN_CLASS() {
        super();
    }

    public void SetInte(String Inte) {
        this.Inte =Inte;
    }

    public String getInte() {
        return Inte;
    }

    public void Settold(String told) {
        this.told=told;
    }

    public String gettold() {
        return told;
    }

    public void SetIlum(String Ilum) {
        this.Ilum=Ilum;
    }

    public String getIlum() {
        return Ilum;
    }
    
       public void Setpre(double pre) {
        this.pre = pre;
    }

    public double getpre() {
        return pre;
    }
    
    @Override
    double TolA() {
                double tol = 0;

        if (told.compareTo("Sunroof") == 0) {
            tol = pre;
        }
        if (told.compareTo("Panoramic roof") == 0) {
            tol = pre + 10000;
        }

        super.SetTol(tol);
        return tol;
        
    }

}
