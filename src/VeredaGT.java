public class VeredaGT implements Vehicle{
    private String matricula;
    private float maxEnergy;
    private float energy;
    private int movementCount = 0;
    private float energyDelta;

    public VeredaGT(String matricula, float maxEnergy, float energy, float energyDelta) {
        this.matricula = matricula;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
        this.energyDelta = energyDelta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getMaxEnergy() {
        return maxEnergy;
    }

    public void setMaxEnergy(float maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public float getEnergy() {
        return energy;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public int getMovementCount() {
        return movementCount;
    }

    public void setMovementCount(int movementCount) {
        this.movementCount = movementCount;
    }

    public float getEnergyDelta() {
        return energyDelta;
    }

    public void setEnergyDelta(float energyDelta) {
        this.energyDelta = energyDelta;
    }

    @Override
    public float energyLevel() {
        System.out.println("El nivel de bateria es: " + energy);
        return 0;
    }

    @Override
    public void recharge() {
        if (energy == maxEnergy){
            System.out.println("Las baterías ya están llenas");
        }else{
            System.out.println("Cargando baterías... ");
            setEnergy(maxEnergy);
            System.out.println("Nivel de carga: " + energy);
        }
    }

    @Override
    public void move() {
        if (energy < energyDelta){
            System.out.println("No tene suficiente energia para moverse");
        }else{
            System.out.println("Moviendose...");
            energy = energy - energyDelta;
            movementCount++;
        }
    }

    @Override
    public String status() {
        System.out.println("El vehículo " + matricula + " tiene un nivel de carga de: " + energy + " y se ha " +
                "movido " + movementCount + " veces.");
        return null;
    }
}
