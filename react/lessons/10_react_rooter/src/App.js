import Home from "./components/Home"
import About from "./components/About"
import Users from "./components/Users"
import Error404 from "./components/Error404page"

import "./App.css"
import {
  BrowserRouter as Router,
  Route,
  NavLink,
  Routes,
} from "react-router-dom"

function App() {
  return (
    <Router>
      <div>
        <nav>
          <ul>
            <li>
              <NavLink
                to="/"
                className={({ isActive }) =>
                  isActive ? "activeClassName" : undefined
                }
              >
                Home
              </NavLink>
            </li>
            <li>
              <NavLink
                to="/about"
                className={({ isActive }) =>
                  isActive ? "activeClassName" : undefined
                }
              >
                About
              </NavLink>
            </li>
            <li>
              <NavLink
                to="/users"
                className={({ isActive }) =>
                  isActive ? "activeClassName" : undefined
                }
              >
                Users
              </NavLink>
            </li>
          </ul>
        </nav>

        <Routes>
          <Route path="/" exact element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/users/*" element={<Users />} />
          <Route path="/*" element={<Error404 />} />
        </Routes>
      </div>
    </Router>
  )
}

export default App
