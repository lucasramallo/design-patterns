package github.lucasramallo.builder;

public class Pizza {
    private String massa;
    private String molho;
    private String cobertura;

    private Pizza(Builder builder) {
        this.massa = builder.massa;
        this.molho = builder.molho;
        this.cobertura = builder.cobertura;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "massa='" + massa + '\'' +
                ", molho='" + molho + '\'' +
                ", cobertura='" + cobertura + '\'' +
                '}';
    }

    public static class Builder {
        private String massa;
        private String molho;
        private String cobertura;

        public Builder massa(String massa) {
            this.massa = massa;
            return this;
        }

        public Builder molho(String molho) {
            this.molho = molho;
            return this;
        }

        public Builder cobertura(String cobertura) {
            this.cobertura = cobertura;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
