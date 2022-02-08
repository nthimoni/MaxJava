import java.util.ArrayList;

public class ChaineProd {
    private ArrayList<Poste> chaineProd;
    private ArrayList<Integer> iterations;
    private ArrayList<ArrayList<Integer>> temps;

    public ChaineProd()
    {
        chaineProd = new ArrayList<Poste>();
        iterations = new ArrayList<Integer>();
        temps = new ArrayList<ArrayList<Integer>>();
    }

    public void addPoste(Poste poste, int ite, ArrayList<Integer> time)
    {
        chaineProd.add(poste);
        iterations.add(ite);
        temps.add(time);
    }
    public int size()
    {
        return chaineProd.size();
    }
    public Poste get(int index)
    {
        return chaineProd.get(index);
    }
    public int ite(int index)
    {
        return iterations.get(index);
    }
    public int getTemps(int indexPoste, int indexTemps)
    {
        return temps.get(indexPoste).get(indexTemps);
    }
}
