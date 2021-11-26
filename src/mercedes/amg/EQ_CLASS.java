package mercedes.amg;

public class EQ_CLASS extends AUTO {

    int Nb, Nm;
    float Kw;
    double pre;

    EQ_CLASS() {
        super();
    }

    public void SetNb(int Nb) {
        this.Nb = Nb;
    }

    public int getNb() {
        return Nb;
    }

    public void SetNm(int Nm) {
        this.Nm = Nm;
    }

    public int getNm() {
        return Nm;
    }

    public void SetKw(float Kw) {
        this.Kw = Kw;
    }

    public float getKw() {
        return Kw;
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

        if (Nm == 1) {
            tol = pre;
        }
        if (Nm == 2) {
            tol = pre + 50000;
        }
        if (Nm == 3) {
            tol = pre + 70000;
        }
        super.SetTol(tol);
        return tol;

    }

}
