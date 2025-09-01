## API RESTful utilizando Spring Boot


Esta API foi desenvolvida utilizando Spring Boot e segue o padrão MVC (Model-View-Controller), com algumas camadas de abstração adicionais para melhorar a organização:
<ul>
<li>Model: representa as entidades e os dados da aplicação.
</li>
<li>Repository: camada responsável pela persistência e acesso ao banco de dados.
</li>
  <li>Service: camada de negócio, que processa regras e operações antes de interagir com o banco ou retornar dados.
</li>
  <li>Controller: expõe os endpoints da API, recebendo requisições HTTP e retornando respostas no formato JSON.
</li>  
</ul>

A API é RESTful, ou seja, segue os princípios do REST:

<ul>
<li>Utiliza métodos HTTP corretos: GET, POST, PUT e DELETE.
</li>
  <li>Possui URLs consistentes e sem verbos, representando recursos da aplicação.
</li>
  <li>Retorna status HTTP adequados conforme o resultado das operações.
</li>
  <li>É stateless, não mantendo estado de sessão entre requisições.</li>
</ul>

Esta API implementa um CRUD de Produtos. Só possuindo como atributos o Id, Nome e Preço para fins de organização.


## Testes com o Postman:

# Metódo de Cadastro de Produto (Post)

<img width="1502" height="653" alt="image" src="https://github.com/user-attachments/assets/30883e47-30dd-4678-9f06-0848db85caee" />

# Metódo de Listar todos os Produtos (Get)

<img width="1498" height="706" alt="image" src="https://github.com/user-attachments/assets/24e6d5c8-1d42-43f9-8f5c-9d8d4592451e" />

# Metódo de trazer o produto por Id (Get)


<img width="1503" height="736" alt="image" src="https://github.com/user-attachments/assets/6da20e4d-7bf9-4858-a67a-6464d895ee69" />

# Metódo de atualizar o produto por Id (Put)

<img width="1539" height="747" alt="image" src="https://github.com/user-attachments/assets/a091fe7e-a9d0-4e32-8c94-cbd86250cc39" />

<img width="713" height="258" alt="image" src="https://github.com/user-attachments/assets/4e20310e-50da-4c7f-89cc-6ab406b20215" />

# Metódo para deletar o produto por Id (Delete)

<img width="1521" height="836" alt="image" src="https://github.com/user-attachments/assets/30c2fe4d-d67f-4147-859d-ff9be958babe" />

<img width="1511" height="798" alt="image" src="https://github.com/user-attachments/assets/5379771c-535a-4c70-a959-707fb7b88743" />










