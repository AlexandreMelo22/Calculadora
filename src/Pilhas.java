class Pilhass {
    private Nv topo;
    public Pilhass() { 
        topo = null;
    }

    public boolean empty() {  
        return (topo == null);
    }

    public int top() {    
        return topo.item;
    }

    public void pop() {     
        if (!empty()) {    
            topo = topo.anterior;
        }
    }

    public void push(int valor) { 
        Nv novo = new Nv(); 
        novo.item = valor;
        novo.anterior = topo;
        topo = novo;
    }
}