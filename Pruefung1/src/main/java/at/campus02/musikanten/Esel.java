package at.campus02.musikanten;

public class Esel extends Musikant {
	protected double trittkraft;

	public Esel(int aB, Instrument i, double trittkraft)
	{
		super(aB, i);
		this.trittkraft = trittkraft;

	}

	public double getTrittkraft() {
		return trittkraft;
	}


	@Override
	public int verscheucheRaeuber() {
		return (int) trittkraft * anzahlBeine;
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	@Override
	public String toString() {
		return "Esel " + trittkraft + ":"+ super.toString();
	}
}
