package docComments;
/**
 * Creates an object with console attributes.
 * @author Chipmunk
 *
 */
public class Console {
	static int count = 0;
	private int id = 0;
	private String dimensions;
	private String controller;
	private String storageSize;
	private String avOutput;
	/**
	 * Creates and initializes console attributes while incrementing console id number.
	 * @param dimensions The size in volume of a console in the form of an expression (i.e. 3x3x3)
	 * @param controller The type of controller the console uses.
	 * @param storageSize The amount of storage the console has.
	 * @param avOutput The type of output that the console has.
	 */
	public Console(String dimensions, String controller, String storageSize, String avOutput) {
		super();
		count++;
		this.id = 1111111 + count;
		this.dimensions = dimensions;
		this.controller = controller;
		this.storageSize = storageSize;
		this.avOutput = avOutput;
	}
	/**
	 * Returns id value for console.
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * Sets id value for console.
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Returns dimension value for console.
	 * @return
	 */
	public String getDimensions() {
		return dimensions;
	}
	/**
	 * Sets the dimension value for the console.
	 * @param dimensions
	 */
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	/**
	 * Returns the type of controller for the console.
	 * @return
	 */
	public String getController() {
		return controller;
	}
	/**
	 * Sets the type of controller for the console.
	 * @param controller
	 */
	public void setController(String controller) {
		this.controller = controller;
	}
	/**
	 * Returns the storage size of the console.
	 * @return
	 */
	public String getStorageSize() {
		return storageSize;
	}
	/**
	 * Sets the storage size for the console.
	 * @param storageSize
	 */
	public void setStorageSize(String storageSize) {
		this.storageSize = storageSize;
	}
	/**
	 * Returns the AV output value for the console.
	 * @return
	 */
	public String getAvOutput() {
		return avOutput;
	}
	/**|
	 * Sets the AV output value for the console.
	 * @param avOutput
	 */
	public void setAvOutput(String avOutput) {
		this.avOutput = avOutput;
	}
	/**
	 * Outputs data from the console in the form of a string.
	 */
	@Override
	public String toString() {
		return "Console [id=" + id + ", dimensions=" + dimensions + ", controller=" + controller + ", storageSize="
				+ storageSize + ", avOutput=" + avOutput + "]";
	}
	
	
}