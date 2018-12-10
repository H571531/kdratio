package net.morclan.beans;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.morclan.eao.DeathsEAO;
import net.morclan.eao.KillsEAO;
import net.morclan.eao.UsersEAO;
import net.morclan.enteties.Kill;
import net.morclan.utils.TownNames;

public class KillsDeathsValidation {
	private String town;
  	private String gearLevel;
  	private String distance;
  	
  	DeathsEAO dEAO;
  	KillsEAO kEAO;
  	
  	
  	
  	public KillsDeathsValidation(HttpServletRequest request, DeathsEAO EAO) {
  		this.town=(String) request.getAttribute("town");
  		this.gearLevel=(String) request.getAttribute("gearlevel");
  		this.distance=(String) request.getAttribute("distance");
  		
  		dEAO=EAO;
  	}
  	public KillsDeathsValidation(HttpServletRequest request, KillsEAO EAO) {
  		this.town=(String) request.getAttribute("town");
  		this.gearLevel=(String) request.getAttribute("gearlevel");
  		this.distance=(String) request.getAttribute("distance");
  		
  		kEAO=EAO;
  		
  	}
  	
public boolean isAltGyldig() {
		
		return isTownLegal()&&isGearLevelLegal()&&isDistanceLegal();
	}

	public boolean isTownLegal() {
		List<String> locations=Arrays.asList(TownNames.getTownNames());
		return locations.stream().anyMatch(s->s.equals(this.town));
	}
	public boolean isGearLevelLegal() {
		List<String> GearLevels = Arrays.asList(new String[]{"Low", "Medium", "High"});
		return GearLevels.stream().anyMatch(g->g.equals(this.gearLevel));
	}
	public boolean isDistanceLegal() {
		List<String> Distances = Arrays.asList(new String[]{"0-100", "100-300", "300-500","500+"});
		return Distances.stream().anyMatch(g->g.equals(this.distance));
	}
	
public Kill createKill() {
	Kill ny= new Kill(town,gearLevel,distance);
	return ny;
}

public void createDeath() {
	
}
  	
}
