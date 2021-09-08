import React from 'react';
import logo from './logo.svg';
import { Counter } from './features/counter/Counter';
import './App.css';
import {LoginPage} from "./Login/LoginPage";

function App() {
  return (
    <div className="App">
      <LoginPage/>
    </div>
  );
}

export default App;
