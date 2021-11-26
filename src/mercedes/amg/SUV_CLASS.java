package mercedes.amg;

public class SUV_CLASS extends AUTO {

    int NAc, Nbs;
    String Tipe_S;
    double pre;

    SUV_CLASS() {
        super();
    }

    public void SetNac(int NAc) {
        this.NAc = NAc;
    }

    public int getNac() {
        return NAc;
    }

    public void SetNbs(int Nbs) {
        this.Nbs = Nbs;
    }

    public int getNbs() {
        return Nbs;
    }

    public void SetTipe_S(String Tipe_S) {
        this.Tipe_S = Tipe_S;
    }

    public String getTipe_S() {
        return Tipe_S;
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

        if (NAc == 5) {
            tol = pre;
        }
        if (NAc == 7) {
            tol = pre + 20000;
        }
        if (NAc == 8) {
            tol = pre + 30000;
        }
super.SetTol(tol);
        return tol;
    }
    
 
    

  

}
