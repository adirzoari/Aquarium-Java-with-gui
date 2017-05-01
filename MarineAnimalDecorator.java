
/**
 * MarineAnimalDecorator class implements MarineAnimal interface and has swimObj that he get on the constructor and change the color
 * @author Adir Zoari 203002753
 * @author Idan Levi 305562431
 */
import java.awt.Color;

public class MarineAnimalDecorator implements MarineAnimal {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	MarineAnimal swimObj;

	
	public MarineAnimalDecorator(MarineAnimal swimObj)
	{
		this.swimObj=swimObj;

	}
	
	@Override
	public void PaintFish(Color col){
		swimObj.PaintFish(col);
	}

}
