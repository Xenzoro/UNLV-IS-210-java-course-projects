// this class is made to model a television
// Jacob Martinez 04/03/2025

public class Television
{   // constant declarations
    private final String MANUFACTURER; // brand of the television
    private final int SCREEN_SIZE; // size of the screen in inches

    // Remaining fields
    private boolean powerOn; // true if the television is on, false if it is off
    private int channel; // current channel
    private int volume; // current volume

    //constructor to initialize the constant fields and set default values for the other fields
    // Jacob Martinez 04/03/2025S
    public Television(String brand, int size)
    {
        this.MANUFACTURER = brand; // assign the brand to the manufacturer
        this.SCREEN_SIZE = size; // assign the size to the screen size
        this.powerOn = false; // set the power state to off
        this.channel = 2; // set the default channel to 2
        this.volume = 20; // set the default volume to 20
    }
    /*
    * method to set the channel
    * @param station the channel to set
    */
    public void setChannel(int station)
    {
        this.channel = station;
    }
    // method to toggle the power
    public void power()
    {   // does the opposite of the current power state
        this.powerOn = !this.powerOn;
    }

    // method to increase volume by 1
    public void increaseVolume()
    {
        this.volume++;
    }
    // method to decrease volume by 1
    public void decreaseVolume()
    {
        this.volume--;
    }

    /**
     * GETTERS
     *
     * @return the current channel
     */
    public int getChannel()
    {
        return this.channel;
    }

    // method to get the current volume
    public int getVolume()
    {
        return this.volume;
    }

    // method to get the manufacturer
    public String getManufacturer()
    {
        return this.MANUFACTURER;
    }

    // method to get the screen size
    public int getScreenSize()
    {
        return this.SCREEN_SIZE;
    }
}
