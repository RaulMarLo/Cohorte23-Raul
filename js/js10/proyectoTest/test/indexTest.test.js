//prueba efectiva
// const indexTest = require('../calculadora'); con const se refiera a un uso para js6np
import { indexTest } from '../calculadora';
 //con import se refiera a un uso para js5

test('test suma', () => {
    const r = indexTest.suma(1, 2);
    expect(r).toBe(3);
})//aqui definimos el test que se ejecutara cuando se ejecute la instrucción 'npm run test' en la terminal.
test.todo('test resta')
test.todo('test multiplicación')
test.todo('test división')