# Serialização

Material do professor Ricardo Frohlich -> Serialização.pdf


## Serialização em C#
https://docs.microsoft.com/pt-br/dotnet/csharp/programming-guide/concepts/serialization/

## Serialização em Java
https://youtu.be/QncDb_JpmFA?si=gG5ONRwgS1XB9CQe


OS SISTEMAS EM GERAL SÃO HETEROGÊNEOS
    - Sistema Operacional diferentes
    - Serviços do SO
    - Banco de Dados diferentes
    - Tecnologias de desenvolvimento diferentes 
    - Arquitetura de funcionamento (Desktop, Web e Mobile)

    Exemplos:

    Sistema 1: Sistema Financeiro -> Desktop, Windows, BD SQL Server, Asp.Net
        BD 1
    Sistema 2: Sistema Acadêmico -> Web, Unix, BD PostGres, PHP 
        BD 2
    Sistema 3: Sistema de RH - > Web, Windows Server, BD Sql Server, C#
        BD 3


    S1  -    S2   -   S3
      
    Como compartilhar dados -> WEBSERVICES -> Protocolos Internet (Endereço IP, Porta Lógica, Socket, Protocolos de transporte TCP e UDP)

SOAP vs REST 
    - SOAP + XML + W3C -> WEBSERVICES (SOAP é ultrapassada)
        - arquitetura cliente-servidor
        
    - REST + JSON -> WEBSERVICES
        - arquitetura cliente-servidor
            - servidor e cliente são transparentes ao outro
        - C# -> System.Text.Json -> JsonSerializer
        - Python -> json


