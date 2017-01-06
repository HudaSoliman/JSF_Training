package beans2;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Color {
	private final String name,value;

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public Color(String name, String value) {
		this.name = name;
		this.value = value;
	}
}
