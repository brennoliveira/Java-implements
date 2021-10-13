package Hash;

import java.util.ArrayList;

/**
 *
 * @author brenn
 */    
    class Map<K, V> 
{ 
    //criando um bucketArray para armazenar o encadeamento    
    private ArrayList<HashNode<K, V>> bucketArray; 
  
    // capacidade do array
    private int numNos; 
  
    // tamanho atual do array
    private int tamanho; 
  
    // Construtor 
    public Map() 
    { 
        bucketArray = new ArrayList<>(); 
        numNos = 10; 
        tamanho = 0; 
  
        // Criando nós nulos
        for (int i = 0; i < numNos; i++) 
            bucketArray.add(null); 
    } 
  
    public int tamanho() { return tamanho; } 
    
    public boolean isEmpty() { return tamanho() == 0; } 
  
    // implementa a função hash para achar o índice de uma chave
    private int getBucketIndex(K key) 
    { 
        // utilizando a função hash da IDE
        int hashCode = key.hashCode(); 
        int indice = hashCode % numNos; 
        return indice; 
    } 
  
    // método para remover uma chave 
    public V remove(K key) 
    { 
        // aplicando a função hash para achar o índice da chave dada
        int bucketIndex = getBucketIndex(key); 
  
        // Pegar a cabeça do encadeamento
        HashNode<K, V> head = bucketArray.get(bucketIndex); 
  
        // procura chave no encadeamento 
        HashNode<K, V> prev = null; 
        while (head != null) 
        { 
            if (head.key.equals(key)) 
                break; 
  
            prev = head; 
            head = head.next; 
        } 
  
        if (head == null) 
            return null; 
  
        // decremento
        tamanho--; 
  
        // Remover
        if (prev != null) 
            prev.next = head.next; 
        else
            bucketArray.set(bucketIndex, head.next); 
  
        return head.value; 
    } 
  
    // Retorna o valor da chave
    public V get(K key) 
    { 
        // achar a cabeça do encadeamento da chave dada
        int bucketIndex = getBucketIndex(key); 
        HashNode<K, V> head = bucketArray.get(bucketIndex); 
  
        // procurar chave
        while (head != null) 
        { 
            if (head.key.equals(key)) 
                return head.value; 
            head = head.next; 
        } 
  
        return null; 
    } 
  
    // Adicionar um par chave-valor na tabela
    public void add(K key, V value) 
    { 
        // achar cabeça do encadeamento da chave dada
        int bucketIndex = getBucketIndex(key); 
        HashNode<K, V> head = bucketArray.get(bucketIndex); 
  
        // Checar se a chave já estiver presente
        while (head != null) 
        { 
            if (head.key.equals(key)) 
            { 
                head.value = value; 
                return; 
            } 
            head = head.next; 
        } 
  
        // inserindo
        tamanho++; 
        head = bucketArray.get(bucketIndex); 
        HashNode<K, V> newNode = new HashNode<K, V>(key, value); 
        newNode.next = head; 
        bucketArray.set(bucketIndex, newNode); 
  
        // se o Load Factor for maior que o determinado
        // dobrar o tamanho da tabela
        if ((1.0*tamanho)/numNos >= 0.7) 
        { 
            ArrayList<HashNode<K, V>> temp = bucketArray; 
            bucketArray = new ArrayList<>(); 
            numNos = 2 * numNos; 
            tamanho = 0; 
            for (int i = 0; i < numNos; i++) 
                bucketArray.add(null); 
  
            for (HashNode<K, V> headNode : temp) 
            { 
                while (headNode != null) 
                { 
                    add(headNode.key, headNode.value); 
                    headNode = headNode.next; 
                } 
            } 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        Map<String, Integer>map = new Map<>(); 
        map.add("olá",1 ); 
        map.add("code",2 ); 
        map.add("olá",4 ); 
        map.add("EDD",5 ); 
        System.out.println(map.tamanho()); 
        System.out.println(map.remove("olá")); 
        System.out.println(map.remove("olá")); 
        System.out.println(map.tamanho()); 
        System.out.println(map.isEmpty()); 
    } 
} 
    
