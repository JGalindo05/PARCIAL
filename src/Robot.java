public class Robot {
    private Bateria bateria;
    private boolean dormido;

    public Robot() {
        this.bateria = new Bateria(1000);
        this.dormido = false;
    }

    public void avanzar(int pasos) {
        if (!dormido) {
            int consumo = (pasos / 100) * 10;
            int nuevaCarga = bateria.getCarga() - consumo;
            bateria.setCarga(Math.max(0, nuevaCarga));
            System.out.println("El robot avanzó " + pasos + " pasos.");
        } else {
            System.out.println("El robot está dormido y no puede avanzar.");
        }
    }

    public void retroceder(int pasos) {
        if (!dormido) {
            int consumo = (pasos / 100) * 10;
            int nuevaCarga = bateria.getCarga() - consumo;
            bateria.setCarga(Math.max(0, nuevaCarga));
            System.out.println("El robot retrocedió " + pasos + " pasos.");
        } else {
            System.out.println("El robot está dormido y no puede retroceder.");
        }
    }

    public void dormir() {
        dormido = true;
        System.out.println("El robot ahora está dormido.");
    }

    public void despertar() {
        dormido = false;
        System.out.println("El robot ahora está despierto.");
    }

    public void recargar() {
        bateria.setCarga(1000);
        System.out.println("La batería del robot ha sido recargada.");
    }

    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;
    }

    public int energiaActual() {
        return bateria.getCarga();
    }

    public boolean estaDormido() {
        return dormido;
    }
}

