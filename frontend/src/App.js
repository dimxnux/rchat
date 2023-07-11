import React, {useState} from 'react';

function App() {
  const [counter, setCounter] = useState(0);

  return (
      <>
        <h1>Chat</h1>
        <p>{counter}</p>
        <button onClick={() => setCounter(counter + 1)}>Button</button>
      </>
  );
}

export default App;
