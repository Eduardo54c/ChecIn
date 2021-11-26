package mercedes.amg;

abstract public class AUTO {

    String Model, Color;
    int Año_f;
    double Tol;

    AUTO() {
    }
    
    abstract double TolA();//método abstracto

    public void SetModel(String Model) {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void SetColor(String Color) {
       this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void SetAño_f(int Año_f) {
        this.Año_f = Año_f;
    }

    public int getAño_fl() {
        return Año_f;
    }
    
        public void SetTol(double Tol) {
        this.Tol= Tol;
    }

    public double getTol() {
        return Tol;
    }
        
    

}
