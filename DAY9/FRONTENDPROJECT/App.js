//import logo from './logo.svg';
import './App.css';
import Nav from './component/Nav';
import AddFood from './component/AddFood';
import DeleteFood from './component/DeleteFood';
import UpdateFood from './component/UpdateFood';
import FoodList from './component/FoodList';
import SearchFood from './component/SearchFood';
import Contact from './component/Contact';
import "bootstrap/dist/css/bootstrap.css";
import { Routes,Route } from 'react-router-dom';
function App() {
  return (
    <div className="App">
      <h2>FOOD APP</h2>
      <Nav/>
      <Routes>
        <Route path="/addfood" element={<AddFood/> }/>
         <Route path="/foodlist" element={<FoodList/> }/>
          <Route path="/delfood" element={<DeleteFood/> }/>
           <Route path="/updfood" element={<UpdateFood/> }/>
            <Route path="/sfood" element={<SearchFood/> }/>
             <Route path="/contact" element={<Contact/> }/>
      </Routes>
    </div>
  );
}

export default App;
