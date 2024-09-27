
Steps to use typescript in existing vite-react project 
==========================================
1) Step 1/6
Install dev dependencies

##
		npm install -D typescript @types/react @types/react-dom

2) Step 2/6
In packages.json, replace:

"build": "vite build"
With 
"build": "tsc && vite build"

3) Step 3/6
Rename vite.config.js and main.jsx to vite.config.ts and main.tsx

4) Step 4/6
Configure TypeScript by creating these two files in the root of your project:

tsconfig.json
##
		{
  		"compilerOptions": {
    		"target": "ESNext",
    		"useDefineForClassFields": true,
    		"lib": ["DOM", "DOM.Iterable", "ESNext"],
    		"allowJs": false,
    		"skipLibCheck": true,
    		"esModuleInterop": false,
    		"allowSyntheticDefaultImports": true,
    		"strict": true,
    		"forceConsistentCasingInFileNames": true,
    		"module": "ESNext",
    		"moduleResolution": "Node",
    		"resolveJsonModule": true,
    		"isolatedModules": true,
    		"noEmit": true,
    		"jsx": "react-jsx"
  		},
  		"include": ["src"],
  		"references": [{ "path": "./tsconfig.node.json" }]
		}
	
tsconfig.node.json
##
		{
  		"compilerOptions": {
    		"composite": true,
    		"module": "ESNext",
    		"moduleResolution": "Node",
    		"allowSyntheticDefaultImports": true
  		},
  		"include": ["vite.config.ts"]
		}
5) Step 5/6

Create a file named vite-env.d.ts inside the src/ folder and copy and paste this (with the three slashes at the beginning):
##
		/// <reference types="vite/client" />
6) Step 6/6

In your index.html you should change the name of your script from the old main.jsx to main.tsx like this:
##
		<script type="module" src="/src/main.tsx"></script>