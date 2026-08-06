# Medir Tempo de Ordenação


## Java

```java
    long tempoInicio, tempoFim;  
    
    tempoInicio = System.nanoTime();
    // rotina1
    tempoFim = System.nanoTime();
    System.out.println("Tempo (ms) rotina 1: " + (tempoFim - tempoInicio)/1000000);

    tempoInicio = System.nanoTime();
    // rotina2
    tempoFim = System.nanoTime();
    System.out.println("Tempo (ms) rotina 2: " + (tempoFim - tempoInicio)/1000000);
```

## C#
```c#
    Stopwatch sw = new Stopwatch();

    sw.Start();
    // rotina 1
    sw.Stop();
    Console.WriteLine("Fim da rotina 1 (ms): " + sw.ElapsedMilliseconds);
    sw.Reset();

    sw.Start();
    // rotina 1
    sw.Stop();
    Console.WriteLine("Fim da rotina 1 (ms): " + sw.ElapsedMilliseconds);
    sw.Reset();
```

## Python
```python
    tempo_inicio = time.time()
    # rotina 1
    tempo_fim = time.time()
    print("Tempo da rotina 1: ", (tempo_fim - tempo_inicio) , "s")        
```

## C++
```cpp
    clock_t tempoInicio, tempoFim;
    tempoInicio = clock();
    // rotina 1
    tempoFim = clock();
    cout << "Tempo para rotina 1: "<< (float)(tempoFim - tempoInicio)/CLOCKS_PER_SEC << endl;
```