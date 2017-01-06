package beans2;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Colors3 extends Colors1 {
	public Colors3(){
		color1="orange";
		color2="#ff0000";
		color3="#008000";
		color4="#0000ff";
	}
	@Override
	public String showColors(){
		return("show-colors3");
	}
}
