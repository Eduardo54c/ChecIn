package mercedes.amg;

public class CUPE_CLASS extends AUTO {

    int Vm;
    String Pll;
    int Nc;
    double pre;

    CUPE_CLASS() {
        super();
    }

    public void SetVm(int Vm) {
        this.Vm = Vm;
    }

    public int getVm() {
        return Vm;
    }

    public void SetPll(String Pll) {
        this.Pll = Pll;
    }

    public String getPll() {
        return Pll;
    }

    public void SetNc(int Nc) {
        this.Nc = Nc;
    }

    public int getNc() {
        return Nc;
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

        if (Nc <=500) {
            tol = pre;
        }
        if (Nc >500) {
            tol = pre + 80000;
        }
        if (Nc >=650) {
            tol = pre + 100000;
        }
        super.SetTol(tol);
        return tol;
    }

}
