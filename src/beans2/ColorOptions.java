package beans2;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
@ApplicationScoped
public class ColorOptions {
	private String[] colorNames = { "red", "orange", "yellow", "green", "blue",
			"purple" };
	
	private List<String> colorValues = Arrays.asList("#ff0000", "#ffa500",
			"#ffff00", "#008000", "#0000ff", "#800080");
	
	private Map<String, String> colorMap = new LinkedHashMap<String, String>();
	
	private List<Color> colorList = new ArrayList<Color>();

	public ColorOptions() {
		for (int i = 0; i < colorNames.length; i++) {
			colorMap.put(colorNames[i], colorValues.get(i));
			colorList.add(new Color(colorNames[i], colorValues.get(i)));
		}
	}

	public String[] getColorNames() {
		return colorNames;
	}

	public void setColorNames(String[] colorNames) {
		this.colorNames = colorNames;
	}

	public List<String> getColorValues() {
		return colorValues;
	}


	public Map<String, String> getColorMap() {
		return colorMap;
	}

	public List<Color> getColorList() {
		return colorList;
	}

}
