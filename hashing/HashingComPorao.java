package hashing;

public class HashingComPorao implements EstruturaDeDados{

    @Override
    public void insert(int chave) {
        int posicao = hash(chave);

        // Se a posição na tabela estiver vazia, insere o valor
        if (tabela[posicao] == 0) {
          tabela[posicao] = chave;
          return;
        }
      
        // Se a posição na tabela estiver ocupada, verifica o porão
        for (int i = 0; i < tamanhoPorao; i++) {
          if (porao[i] == 0) {
            porao[i] = chave;
            return;
          }
        }
      
        // Se o porão estiver cheio, redimensionar (opcional)
        // ...
      
        // Lançar exceção se a tabela e o porão estiverem cheios
        throw new RuntimeException("Tabela e porão cheios!");
        
    }

    @Override
    public void delete(int chave) {
        int posicao = hash(chave);

        // Se a posição na tabela estiver vazia, insere o valor
        if (tabela[posicao] == 0) {
          tabela[posicao] = chave;
          return;
        }
      
        // Se a posição na tabela estiver ocupada, verifica o porão
        for (int i = 0; i < tamanhoPorao; i++) {
          if (porao[i] == 0) {
            porao[i] = chave;
            return;
          }
        }
      
        // Se o porão estiver cheio, redimensionar (opcional)
        // ...
      
        // Lançar exceção se a tabela e o porão estiverem cheios
        throw new RuntimeException("Tabela e porão cheios!");
        
    }

    @Override
    public boolean search(int chave) {
        int posicao = hash(chave);

        // Se a chave estiver na posição da tabela, retorna true
        if (tabela[posicao] == chave) {
          return true;
        }
      
        // Se a chave não estiver na posição da tabela, verifica o porão
        for (int i = 0; i < tamanhoPorao; i++) {
          if (porao[i] == chave) {
            return true;
          }
        }
      
        // Retorna false se a chave não for encontrada
        return false;
    }
    
}
