public class Plot {
    private String category;
    private String plotNumber;
    private float size;
    private Person[] owners;
    private Address[] addresses;
    private Dimmension[] dimensions;
    private int plotindex = 0;
    private int personcount = 0;
    private int addresscount = 0;
    private int dimensioncount = 0;

    Plot(String category, String plotNumber, float size) {
        this.category = category;
        this.plotNumber = plotNumber;
        this.size = size;
    }

    public void addperson(Person person) {
        if (person != null) {
            owners[personcount] = person;
            personcount++;
        }
    }

    public void addaddress(Address address) {
        if (address != null) {
            addresses[addresscount] = address;
            addresscount++;
        }
    }

    public void adddimension(Dimmension dimension) {
        if (dimension != null) {
            dimensions[dimensioncount] = dimension;
            dimensioncount++;
        }
    }

    public void addplot(Plot[] plots, Plot plot) {
        if (plot != null) {
            plots[plotindex] = plot;
            plotindex++;
        }
    }
    public String getCategory(){
        return category;
    }
    public String getPlotNumber(){
        return plotNumber;
    }
    public float getSize(){
        return size;
    }
    public Person[] getOwners(){
        return owners;
    }
     public Address[] getAddresses(){
        return addresses;
    }
    public Dimmension[] getDimensions(){
        return dimensions;
    }
    public int getIndex(){
        return plotindex;
    }
    public void setIndex(int index){
        this.plotindex = index;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPlotNumber(String plotNumber){
        this.plotNumber = plotNumber;
    }
    public void setSize(float size){
        this.size = size;
    }
    public void setOwners(Person[] owners){
        this.owners = owners;
    }
    public void setAddresses(Address[] addresses){
        this.addresses = addresses;
    }
    public void setDimensions(Dimmension[] dimensions){
        this.dimensions = dimensions;
    }
    public String toString(){
        return String.format("Catagory: %s\n PlotNumber: %s\n Plotsize: %.2f\n",category,plotNumber,size);
    }
}
