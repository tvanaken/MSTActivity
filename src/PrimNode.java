public class PrimNode extends JSONNodeHelper implements Comparable<PrimNode> {
	public PrimNode p = null;
	public Integer key = Integer.MAX_VALUE;
	public Integer id;
	public String label;
	
	
	public PrimNode(Integer id) {
		this.id = id;
		this.label = id.toString();
	}
	
	public PrimNode(Integer id, String label) {
		this.id = id;
		this.label = label;
	}
	
	@Override
	public String toString() {
		String str = "Node: " + this.label;
		if (this.key == Integer.MAX_VALUE) {
			str += " (weight: ∞)\t";
		} else {
			str += " (weight: " + this.key + ")\t";
		}
		if (this.p != null) {
			str += "--> " + this.p.label;
		} else {
			str += "--> (null)";
		}
		return str;
	}

	@Override
	public int compareTo(PrimNode o) {

		if (this.id > o.id) {
			return 1;
		} else if (this.id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
