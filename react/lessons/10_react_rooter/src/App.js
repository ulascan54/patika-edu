import Home from "./components/Home"
import About from "./components/About"
import Users from "./components/Users"
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom"
function App() {
  return (
    <Router>
      <div>
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/about">About</Link>
            </li>
            <li>
              <Link to="/users">Users</Link>
            </li>
          </ul>
        </nav>

        {/* A <Switch> looks through its children <Route>s and
            renders the first one that matches the current URL. */}
        <Switch>
          <Route path="/about" components={About}></Route>
          <Route path="/users" components={Users}></Route>
          <Route path="/" components={Home}></Route>
        </Switch>
      </div>
    </Router>
  )
}

export default App
