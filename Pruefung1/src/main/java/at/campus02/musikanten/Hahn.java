package at.campus02.musikanten;

public class Hahn extends Musikant {
	protected int flugWeite;
	public Hahn(int aB, Instrument i , int flugWeite) {
		super(aB, i);
		this.flugWeite = flugWeite;

	}

	public int getFlugWeite() {
		return flugWeite;
	}

	@Override
	public int verscheucheRaeuber() {

		if(flugWeite < 2){
			return (int)instrument.getLautstaerke();
		}
		switch (flugWeite)
		{
			case 2:
				return 6;
			case 3:
				return 5;
			case 4:
				return 4;
			case 5:
				return 3;
			case 6:
				return 2;
		}

		return 1;
	}

	@Override
	public double spieleMusik() {

		return instrument.getLautstaerke() + 2 / flugWeite;
	}

	@Override
	public String toString() {
		return "Hahn " + flugWeite + ":"+ super.toString();
	}

}
