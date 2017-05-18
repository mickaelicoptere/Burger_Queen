package project.Model;

public class Composition {
	private boolean deBase;
	private boolean optionnel;
	private boolean extra;

	public Composition () { this.deBase = false; this.extra=false; this.extra=false; }
	public Composition (boolean deBase, boolean optionnel, boolean extra) { this.deBase = deBase; this.optionnel=optionnel; this.extra=extra; }

	public boolean getDeBase () { return deBase; }
	public boolean getOptionnel () { return optionnel; }
	public boolean getExtra () { return extra; }

	public void setDeBase (boolean deBase) { this.deBase=deBase; }
	public void setOptionnel (boolean optionnel) { this.deBase=optionnel; }
	public void setExtra (boolean extra) { this.deBase=extra; }

	public String toString () {return ("De Base : "+deBase+"\n"+"Optionnel : "+optionnel+"\n"+"Extra : "+extra); }
}