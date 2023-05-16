interface KarbonAyakizi {
    double getKarbonAyakizi();
}

class Yapi implements KarbonAyakizi {
    private final double elektrikkullanimi;

    public Yapi(double elektrikkullanimi) {
        this.elektrikkullanimi = elektrikkullanimi;
    }

    @Override
    public double getKarbonAyakizi() {
        return this.elektrikkullanimi * 0.5;
    }

    public String toString() {
        return "Yapi";
    }
}

class Arac implements KarbonAyakizi {
    private final double yakitkullanimi;
    public Arac(double yakitkullanimi) {
        this.yakitkullanimi = yakitkullanimi;
    }

    @Override
    public double getKarbonAyakizi() {
        return this.yakitkullanimi * 2.3;
    }

    public String toString() {
        return "Arac";
    }
}

class Bisiklet implements KarbonAyakizi {

    @Override
    public double getKarbonAyakizi() {
        return 0;
    }

    public String toString() {
        return "Bisiklet";
    }
}

